package it.bandadirecco.musicarchive.web.view;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

/**
 * This view is the splash screen for the web application,
 * mapped to the empty route
 *
 * @author Stefano Demarchi
 */
@Route("")
@PageTitle("MusicArchive :: Welcome")
@Theme(value = Material.class)
@StyleSheet("css/homepage.css")
public class MainView extends VerticalLayout {
    /**
     * Splash screen work in progress
     */
    public MainView() {
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        Button enter = new Button("Enter");
        enter.addClickShortcut(Key.ENTER);
        enter.addClickListener(e -> UI.getCurrent().navigate("dashboard"));

        this.add(enter);
    }
}
