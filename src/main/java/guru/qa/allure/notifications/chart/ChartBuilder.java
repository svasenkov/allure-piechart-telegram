package guru.qa.allure.notifications.chart;

import guru.qa.allure.notifications.config.helpers.Base;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChartBuilder {
    private static final Logger LOG = LoggerFactory.getLogger("Chart Builder");

    public static PieChart createBaseChart() {
        final String title = Base.projectName();
        LOG.info("Creating chart with title {}...", title);
        PieChart chart = new PieChartBuilder()
                .title(title)
                .width(500)
                .height(250)
                .build();
        LOG.info("Done.");
        return chart;
    }
}
