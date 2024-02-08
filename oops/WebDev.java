package oops;
//will be practicing interface and methods

interface Requrement {
    void frontEndDevelopment();

    void backEndDevelopment();

    void devOps();

    void cloudManagment();

    void pricingTeam();

    void onCallTeam();
}

abstract class FrontEndTeam implements Requrement {

    @Override
    public void frontEndDevelopment() {
        System.out.println("They started Designing the FE PART");
    }
}

abstract class BackEndTeam extends FrontEndTeam {
    @Override
    public void backEndDevelopment() {
        System.out.println("They started Working on the BE part");
    }
}

abstract class DevOps extends BackEndTeam {
    @Override
    public void devOps() {
        System.out.println("The handle the build in The CI/CD pipeline");
    }
}

abstract class CloudManagement extends DevOps {
    @Override
    public void cloudManagment() {
        System.out.println("They Deploy the Services to the cloud container");
    }
}

abstract class PricingTeam extends CloudManagement {
    @Override
    public void pricingTeam() {
        System.out.println("They make sure the Prices of the Products are added successfully by collaborating with FE and BE team");
    }
}

class OnCallTeam extends PricingTeam {
    @Override
    public void onCallTeam() {
        System.out.println("They are always on the PROD CALL taking LOOK at the logs using cloudwatch");
    }
}

public class WebDev {
    //will call the objects here
    public static void main(String[] args) {
        OnCallTeam team1 = new OnCallTeam();
        team1.frontEndDevelopment();
        team1.backEndDevelopment();
        team1.devOps();
        team1.pricingTeam();
        team1.cloudManagment();
        team1.onCallTeam();
    }

}
