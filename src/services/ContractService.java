package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlineServicePayment onlineServicePayment;

	public ContractService(OnlineServicePayment onlineServicePayment) {
		this.onlineServicePayment = onlineServicePayment;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			Date dateQuota = addMonths(contract.getDate(), i);
			double installmentsFee = basicQuota + onlineServicePayment.interest(basicQuota, i);
			double fullQuota = installmentsFee + onlineServicePayment.paymentFee(installmentsFee);
			contract.addInstallment(new Installment(dateQuota, fullQuota));

		}
		contract.getDate();
	}

	public Date addMonths(Date date, int months) {
		Date d = date;
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MONTH, months);
		return cal.getTime();
	}

}
