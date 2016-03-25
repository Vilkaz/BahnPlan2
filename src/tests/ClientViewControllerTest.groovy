package tests

import controller.ClientViewController
import javafx.scene.layout.HBox
import org.junit.Test
/**
 * Created by Vilkazzz on 19/03/2016.
 */
class ClientViewControllerTest extends GroovyTestCase {

    @Test
    void testActivateClientView() {
        HBox adminTools = new HBox();
        adminTools.setVisible(false);
        adminTools.setDisable(true);
        ClientViewController.activateClientView(adminTools);
        assertFalse(adminTools.isVisible());
        assertTrue(adminTools.isDisabled());
    }
}
