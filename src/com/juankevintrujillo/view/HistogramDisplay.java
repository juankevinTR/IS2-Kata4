package com.juankevintrujillo.view;

import com.juankevintrujillo.model.Histogram;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author juankevintr
 */
public class HistogramDisplay extends ApplicationFrame {
    
    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram histogram){
        super("Histogram");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histogram JFreeChar", "Domain", "No. emails", dataSet, PlotOrientation.VERTICAL, false, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(String key : histogram.keySet()){
            dataSet.addValue(histogram.get(key),"",key);
        
        }
        
        // dataSet.addValue(300,"","ulpgc.es");
        // dataSet.addValue(400,"","dis.ulpgc.es");
        // dataSet.addValue(200,"","gmail.com");
        return dataSet;
    }
    
}
