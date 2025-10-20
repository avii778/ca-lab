package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInteractor;
import use_case.logout.LogoutOutputData;
import use_case.signup.SignupInputData;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    private LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {

        // TODO: Save the interactor in the instance variable.
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     */
    public void execute() {
        this.logoutUseCaseInteractor.execute();
    }
}
