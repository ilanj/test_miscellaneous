//package test_miscellaneous.charts.jfreechart;
//
//import java.io.File;
//import java.io.IOException;
//
//import javax.swing.JFrame;
//
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.ChartUtilities;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.axis.CategoryAxis;
//import org.jfree.chart.axis.NumberAxis;
//import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.renderer.category.BarRenderer;
//import org.jfree.chart.renderer.category.CategoryItemRenderer;
//import org.jfree.chart.renderer.category.LineAndShapeRenderer;
//import org.jfree.data.category.DefaultCategoryDataset;
//
//public class Combined extends JFrame{
//	public static void main()
//	{
//		private static final long serialVersionUID = 1L;
//
//		   public Combined(String title) {
//		      super(title);
//
//		      // Create Category plot
//		      CategoryPlot plot = new CategoryPlot();
//
//		      // Add the first dataset and render as bar
//		      CategoryItemRenderer lineRenderer = new LineAndShapeRenderer();
//		      plot.setDataset(0, createDataset());
//		      plot.setRenderer(0, lineRenderer);
//
//		      // Add the second dataset and render as lines
//		      CategoryItemRenderer baRenderer = new BarRenderer();
//		      plot.setDataset(1, createDataset());
//		      plot.setRenderer(1, baRenderer);
//
//		      // Set Axis
//		      plot.setDomainAxis(new CategoryAxis("Time"));
//		      plot.setRangeAxis(new NumberAxis("Value"));
//
//		      JFreeChart chart = new JFreeChart(plot);
//		      chart.setTitle("Combined Bar And Line Chart | BORAJI.COM");
//
//		      ChartPanel panel = new ChartPanel(chart);
//		      setContentPane(panel);
//		      File BarChart = new File( "BarChart.jpeg" );
//		      try {
//				ChartUtilities.saveChartAsPNG(BarChart, chart, 900, 300);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
//		   public static  DefaultCategoryDataset createDataset() {
//
//			      // First Series
//			      String series1 = "Vistor";
//			      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//			      dataset.addValue(200, series1, "2016-12-19");
//			      dataset.addValue(150, series1, "2016-12-20");
//			      dataset.addValue(100, series1, "2016-12-21");
//			      dataset.addValue(210, series1, "2016-12-22");
//			      dataset.addValue(240, series1, "2016-12-23");
//			      dataset.addValue(195, series1, "2016-12-24");
//			      dataset.addValue(245, series1, "2016-12-25");
//
//			      // Second Series
//			      String series2 = "Unique Visitor";
//			      dataset.addValue(150, series2, "2016-12-19");
//			      dataset.addValue(130, series2, "2016-12-20");
//			      dataset.addValue(95, series2, "2016-12-21");
//			      dataset.addValue(195, series2, "2016-12-22");
//			      dataset.addValue(200, series2, "2016-12-23");
//			      dataset.addValue(180, series2, "2016-12-24");
//			      dataset.addValue(230, series2, "2016-12-25");
//
//			      return dataset;
//			   }
//
//
//}
//}