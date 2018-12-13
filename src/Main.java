import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {

        stage.setTitle("Line Chart Sample");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

        lineChart.setTitle("Something to do With Trees");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("2015 Tree Census");

        CSVUtilities data = new CSVUtilities();

        //populating the series with data
        for (int i = 0; i < CSVData.size(); i++)
        series.getData().add(new XYChart.Data());

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}