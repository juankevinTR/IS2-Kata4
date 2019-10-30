package com.juankevintrujillo.main;

import com.juankevintrujillo.model.Histogram;
import com.juankevintrujillo.view.HistogramDisplay;
import com.juankevintrujillo.model.Mail;
import com.juankevintrujillo.view.MailListReader;
import com.juankevintrujillo.view.MailHistogramBuilder;

import java.util.List;

/**
 *
 * @author juankevintr
 */
public class Main {

    public static void main(String[] args) {

	String fileName = new String("src/resources/email.txt");
	List<Mail> mailList = MailListReader.read(fileName);
	Histogram histogram = MailHistogramBuilder.build(mailList);
	HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
	histoDisplay.execute();

    }

}
