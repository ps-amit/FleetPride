package Configuration;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import TestRunner.TestCaseRunner;
/**
 * @author Amit K Singh
 *
 * Tag: Send report table format
 */
public class SendReport {

	public static void sendmail() {

		//String tolist = "mohit.jain@fleetpride.com,laxma.katika@fleetpride.com,anchit.sharma@puresoftware.com,divya.goel@fleetpride.com,amit.singh@puresoftware.com";
		
		//String tolist = "anchit.sharma@puresoftware.com,amit.singh@puresoftware.com,divya.goel@puresoftware.com";
		
		String tolist = "amit.singh@puresoftware.com";
		
		List<String> Sendtolist = new ArrayList<String>();
		StringTokenizer todetail = new StringTokenizer(tolist, ";");
		
		
		while (todetail.hasMoreTokens()) {
			Sendtolist.add(todetail.nextToken());
		}
		

		String from = "amit.singh@puresoftware.com";

		final String username = "amit.singh@puresoftware.com";

		final String password = "Amit@Clpps2107g";

		String host = "smtp.gmail.com";
		//String host = "smtpmail.fleetpride.local";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		//props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "25");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));

			
			for (int i = 0; i < Sendtolist.size(); i++) {
				// System.out.println(Constant.tolist.get(i));
				message.addRecipients(Message.RecipientType.TO,
						InternetAddress.parse(Sendtolist.get(i)));

			}
			
			
			/*message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));*/

			// Subject:
			message.setSubject("E2E and Regression Test suite Report");

			// message part
			BodyPart messageBodyPart = new MimeBodyPart();

			// actual message
			messageBodyPart
					.setText("PDC Ecomm Test Report " + new Date());

			// multipart message
			Multipart multipart = new MimeMultipart();

			// message part
			multipart.addBodyPart(messageBodyPart);
			
			
			
			
			
			

			TestCaseRunner.emailBody.append("</tr>");
			TestCaseRunner.emailBody.append(" </table>");
			
			TestCaseRunner.emailBody.append("<tr>");
			TestCaseRunner.emailBody.append(" <th style='padding:5px'>*Download report to see it in a proper format </th>");
			TestCaseRunner.emailBody.append("</tr>");
			
			TestCaseRunner.emailBody.append("</div>");
			
			TestCaseRunner.emailBody.append("<div>");
			TestCaseRunner.emailBody.append("<tr>");
			TestCaseRunner.emailBody.append(" <th style='padding:5px'>Thanks & Regards</th>");
			TestCaseRunner.emailBody.append("</tr>");
			TestCaseRunner.emailBody.append("<tr>");

			TestCaseRunner.emailBody.append(" <th style='padding:5px'>Puresoftware Pvt. Ltd</th>");
			TestCaseRunner.emailBody.append("</tr>");


			TestCaseRunner.emailBody.append("</div>");
			TestCaseRunner.	emailBody.append("</body>");

			TestCaseRunner.emailBody.append("</html>");
			
			// clear  console
			
			
		//	String str="<html><head><title>HTML 5 Example by www.techonthenet.com</title></head><body><h1>Heading</h1><p>This is the content.</p></body></html>";

		//	messageBodyPart.setText(TestCaseRunner.emailBody.toString());
       //messageBodyPart.setText(str);


			messageBodyPart.setContent(TestCaseRunner.emailBody.toString(), "text/html; charset=utf-8");		

			// attachment
			messageBodyPart = new MimeBodyPart();
		//	String filename = "D:\\TestReport.html";
			
			//String filename="C:\\Automation_Framework_Puresoftware_New\\src\\reports\\TestReport.html";
			
			String filename="C:\\Automation_Framework_Puresoftware_New\\src\\reports\\TestReport.html";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			// Send message
			Transport.send(message);

			System.out.println("Email sent successfully..........");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}
