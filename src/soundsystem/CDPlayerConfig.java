package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"soundsystem", "video"})
public class CDPlayerConfig {

    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }




    /**
     * Больше одного бина КомпактДиск - нельзя.
     * Соответственно либо то, либо это.
     * */
    /*@Bean
    CDPlayer cdPlayer2(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }*/



}

