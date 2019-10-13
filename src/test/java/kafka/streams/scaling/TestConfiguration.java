package kafka.streams.scaling;

import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static java.util.Arrays.asList;

@Configuration
public class TestConfiguration {

    @Bean("valid-hotel-record-json")
    public String getValidHotelRecord() {
        return "{" +
                "\"Id\":\"3427383902209\"," +
                "\"Name\":\"H tel Barri re Le Fouquet s\"," +
                "\"Country\":\"FR\"," +
                "\"City\":\"Paris\"," +
                "\"Address\":\"46 Avenue George V 8th arr 75008 Paris France\"," +
                "\"Latitude\":\"48.8710709\"," +
                "\"Longitude\":\"2.3013119\"," +
                "\"geohash\":\"u09wh\"" +
                "}";
    }

    @Bean("valid-weather-records-json")
    public List<String> getValidWeatherRecords() {
        return asList(
                "{\"lng\":-105.533,\"lat\":22.4782,\"avg_tmpr_f\":84.3,\"avg_tmpr_c\":29.1,\"wthr_date\":\"2017-08-03\",\"year\":2017,\"month\":3,\"day\":8}",
                "{\"lng\":-77.621,\"lat\":21.777,\"avg_tmpr_f\":85.1,\"avg_tmpr_c\":29.5,\"wthr_date\":\"2017-08-03\",\"year\":2017,\"month\":3,\"day\":8}",
                "{\"lng\":-79.5727,\"lat\":21.9972,\"avg_tmpr_f\":82.2,\"avg_tmpr_c\":27.9,\"wthr_date\":\"2017-08-03\",\"year\":2017,\"month\":3,\"day\":8}",
                "{\"lng\":-89.9884,\"lat\":20.6717,\"avg_tmpr_f\":84.1,\"avg_tmpr_c\":28.9,\"wthr_date\":\"2017-08-29\",\"year\":2017,\"month\":29,\"day\":8}",
                "{\"lng\":-79.1301,\"lat\":21.5823,\"avg_tmpr_f\":85.1,\"avg_tmpr_c\":29.5,\"wthr_date\":\"2017-08-03\",\"year\":2017,\"month\":3,\"day\":8}"
        );
    }
}