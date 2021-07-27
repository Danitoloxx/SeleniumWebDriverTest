package dropdownJS;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownJSTest extends BaseTest {
    @Test
    public void testAddMultipleAttributesToDropdown(){
        var dropdownJsPage = homepage.clickDropdownJs();
        dropdownJsPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownJsPage::selectFromDropDown);

        var selectedOptions = dropdownJsPage.getSekectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
