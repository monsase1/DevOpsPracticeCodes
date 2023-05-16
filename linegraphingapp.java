import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraphExample {
    public static void main(String[] args) {
        // Create dataset
        XYSeries series1 = new XYSeries("Data Set 1");
        series1.add(1, 5);
        series1.add(2, 10);
        series1.add(3, 8);
        series1.add(4, 12);
        
        XYSeries series2 = new XYSeries("Data Set 2");
        series2.add(1, 3);
        series2.add(2, 6);
        series2.add(3, 4);
        series2.add(4, 8);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        
        // Create the chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Graph Example",
            "X",
            "Y",
            dataset
        );
        
        // Display the chart in a frame
        ChartFrame frame = new ChartFrame("Graph", chart);
        frame.pack();
        frame.setVisible(true);
    }
}





















