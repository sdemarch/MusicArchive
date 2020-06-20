package it.bandadirecco.musicarchive;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("")
@PageTitle("MusicArchive")
public class MainView extends VerticalLayout {
    public MainView() {
        this.add(new Label("Hello"));
    }
}
