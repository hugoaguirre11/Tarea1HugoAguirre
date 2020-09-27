package testClean;

import activity.whendo.AddNoteToList;
import activity.whendo.DeleteNote;
import activity.whendo.MainActivity;
import org.junit.Assert;
import org.junit.Test;


import java.net.MalformedURLException;

public class WhendoTest {
    MainActivity whendoActivity = new MainActivity();
    AddNoteToList addNoteToList = new AddNoteToList();
    DeleteNote deleteNoteOfList = new DeleteNote();

    @Test
    public void verifyAddNumber() throws MalformedURLException {

        String note = "uno";
        String description="descripcion "+note;
        whendoActivity.addListButton.click();
        addNoteToList.titleNote.type(note);
        addNoteToList.descriptionNote.type("anotamos la primera tarea");
        addNoteToList.saveButton.click();
        Assert.assertTrue("ERROR! al insertar la nota",whendoActivity.isDisplayeNotes(note));


        whendoActivity.isButtonDeleteNoteOfList(note);
        whendoActivity.buttonDeleteNoteList.click();
        deleteNoteOfList.deleteButton.click();
        deleteNoteOfList.confirmDeleteButton.click();
        Assert.assertTrue("ERROR! al eliminar la nota",!whendoActivity.isDisplayeNotes(note));


    }

    /*@After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }*/
}
