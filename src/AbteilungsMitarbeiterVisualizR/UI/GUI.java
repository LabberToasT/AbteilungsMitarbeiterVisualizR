package AbteilungsMitarbeiterVisualizR.UI;

import AbteilungsMitarbeiterVisualizR.Fachkonzept.IFachkonzept;
import AbteilungsMitarbeiterVisualizR.Fachkonzept.Fachkonzept1;
import AbteilungsMitarbeiterVisualizR.Persistence.IPersistence;
import tests.Fachkonzept.VisualizR_GUI;

public class GUI {
    private IFachkonzept mFachkonzept;
    // TODO implement me
    public GUI(IPersistence persistence) {
        mFachkonzept = new Fachkonzept1(persistence);
    }

    public void show() {
        VisualizR_GUI gui = new VisualizR_GUI();
        gui.setDataNew(mFachkonzept.getDepartments());
        gui.guiShow();
    }
}
