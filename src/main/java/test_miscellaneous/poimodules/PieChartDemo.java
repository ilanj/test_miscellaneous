package test_miscellaneous.poimodules;

import java.awt.Color;
import java.io.IOException;


import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.PieSeries;
import org.knowm.xchart.style.Styler;
public class PieChartDemo {

	  public static void main(String[] args) throws IOException {

	    // Create Chart
	    PieChart chart = new PieChartBuilder().width(600).height(400).title("My Pie Chart").theme(ChartTheme.GGPlot2).build();

	    // Customize Chart
	    chart.getStyler().setLegendVisible(true).setLegendPosition(Styler.LegendPosition.OutsideE);
	 chart.getStyler().setLegendVisible(true);
	    chart.getStyler().setAnnotationType(AnnotationType.LabelAndPercentage);
	    chart.getStyler().setAnnotationDistance(1.30);
	    chart.getStyler().setPlotContentSize(.30);
	    chart.getStyler().setStartAngleInDegrees(0);
	    chart.getStyler().setChartBackgroundColor(Color.getHSBColor(96, 68, 79));
	    chart.getStyler().setLegendBorderColor(Color.blue);
	    chart.getStyler().setPlotBorderColor(Color.black);
	    
	   // chart.getStyler().setDefaultSeriesRenderStyle(PieSeries.PieSeriesRenderStyle.Donut);

	    // Series
	   chart.addSeries("Prague", 2);
	    chart.addSeries("Dresden", 4);
	    chart.addSeries("Munich", 34);
	    chart.addSeries("Hamburg", 22);
	    chart.addSeries("Berlin", 29);

	    // Show it
	    new SwingWrapper(chart).displayChart();

	    // Save it
	    BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapFormat.PNG);

	    // or save it in high-res
	    BitmapEncoder.saveBitmapWithDPI(chart, "./Sample_Chart_300_DPI", BitmapFormat.PNG, 600);
	  }

	}