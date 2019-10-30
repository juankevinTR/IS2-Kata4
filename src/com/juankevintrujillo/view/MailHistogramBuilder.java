package com.juankevintrujillo.view;

import com.juankevintrujillo.model.Histogram;
import com.juankevintrujillo.model.Mail;
import java.util.List;

/**
 *
 * @author juankevintr
 */
public class MailHistogramBuilder {

    public static Histogram build(List<Mail> mailList) {
	Histogram<String> histogram = new Histogram();

	for (Mail mail : mailList) {
	    histogram.increment(mail.getDomain());
	}
	return histogram;
    }

}
