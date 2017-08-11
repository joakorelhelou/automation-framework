package automation_framework;


import cucumber.api.java8.En;

/**
 * Created by Usuario on 6/16/2017.
 */
public class MyStepDefs implements En {

    public MyStepDefs() {

        Given("I have (\\d+) cukes in my belly", (Integer cukes) -> {
            System.out.format("Cukes: %n\n", cukes);
        });

        Then("The test passed", () ->{
            assert true;
        });
    }

}
