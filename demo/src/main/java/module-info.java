module com.oppimittinetworking.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.oppimittinetworking.demo to javafx.fxml;
    exports com.oppimittinetworking.demo;
}