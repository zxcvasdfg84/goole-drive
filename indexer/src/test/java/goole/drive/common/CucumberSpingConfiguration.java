package goole.drive.common;

import goole.drive.IndexerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexerApplication.class })
public class CucumberSpingConfiguration {}
