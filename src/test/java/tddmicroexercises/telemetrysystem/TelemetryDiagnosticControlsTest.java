package tddmicroexercises.telemetrysystem;

import org.junit.Before;
import org.junit.Test;

public class TelemetryDiagnosticControlsTest {

    private TelemetryDiagnosticControls controls;

    @Before
    public void before() {
        controls = new TelemetryDiagnosticControls();
    }

    @Test
    public void disconnect_should_be_first_operation_on_telemetry_client() {
    }

    @Test
    public void should_connect_to_telemetry_client_using_correct_connection_string() {
    }

    @Test
    public void should_try_to_connect_to_telemetry_client_three_times() {
    }

    @Test(expected = Exception.class)
    public void should_throw_exception_if_unable_to_connect() throws Exception {
    }

}
