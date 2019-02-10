package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller implements Initializable{
    public ListView listv;
    @FXML
    private Tab Main_Tab;
    @FXML
    private ImageView icMaonMove;
    @FXML
    private Label MainLable1;
    @FXML
    private JFXTextField Txfiled_Name_Customer;
    @FXML
    private JFXTextField Txfiled_Address_Customer;
    @FXML
    private JFXTextField Txfiled_MNum_Customer;
    @FXML
    private JFXTextField Txfiled_Email_Customer;
    @FXML
    private JFXButton Btn_ChangeMN_Customer;
    @FXML
    private JFXButton Btn_Save_Customer;
    @FXML
    private JFXButton Btn_Search_Customer;
    @FXML
    private Tab Mangment_MO_Tab;
    @FXML
    private JFXTextField Txfiled_Name_SP;
    @FXML
    private JFXTextField Txfiled_Quantity_SP;
    @FXML
    private JFXTextField Txfiled_SPNum_SP;
    @FXML
    private JFXTextField Txfiled_Price_SP;
    @FXML
    private JFXTextArea Txfiled_Discription_SP;
    @FXML
    private JFXButton Btn_Cancle_SP;
    @FXML
    private JFXButton Btn_Delete_SP;
    @FXML
    private JFXButton Btn_Save_SP;
    @FXML
    private JFXButton Btn_Search_SP;
    @FXML
    private ToggleGroup ReportsDate;
    @FXML
    private Label MainLable;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listv.getItems().add("- عمليات الصيانة الحالية");
        listv.getItems().add("- عمليات الصيانة المنتهية");
        listv.getItems().add("- عمليات الصيانة السابقة");
        listv.getItems().add("- تقدير مالي عن عملية صيانة");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قائمة بالعملاء");
        listv.getItems().add("- قائمة عمليات الصيانة لعميل");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قائمة بالموظفين");
        listv.getItems().add("- قائمة عمليات الصيانة لموظف");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قائمة بالمزودين");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قطع على وشك النفاذ");
        listv.getItems().add("- قطع الغيار التي نفذت كميتها");


           }
    
    
    void loadWindow(String loc , String title){
        try {

            Parent parent = FXMLLoader.load(getClass().getResource(loc));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(new Scene(parent));
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }}


    @FXML
    private void Btn_AddMO_MangeMO(ActionEvent event) {
      loadWindow("/sample/AddMoNeww.fxml" ,"" );

    }

    @FXML
    private void Main_Tab(Event event) {
    }

    @FXML
    private void M_Txfiled_MNum_Customer(ActionEvent event) {
    }

    @FXML
    private void M_Btn_ChangeMN_Customer(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Cancle_Customer(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Delete_Customer(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Save_Customer(ActionEvent event) {
        
    Txfiled_Name_Customer.setText("Hellllooooooo");

    }

    @FXML
    private void M_Btn_Search_Customer(ActionEvent event) {
    }

    @FXML
    private void Mangment_Customer_tab_selected(Event event) {
    }

    @FXML
    private void Btn_Edit_MangeCurrentMO(ActionEvent event) {
    }

    @FXML
    private void M_Txfiled_Search_MangeCurrentMO(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangeFinshedMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangeFinshedMO(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangePreviousMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangePreviousMO(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangePendingMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangePendingMO(ActionEvent event) {
    }

    @FXML
    private void Mangment_MO_tab_selected(Event event) {
    }

    @FXML
    private void M_Txfiled_Name_SP(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Cancle_SP(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Delete_SP(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Save_SP(ActionEvent event) {
    }

    @FXML
    private void Mangment_SpearParts_tab_selected(Event event) {
    }

    @FXML
    private void RequstSpearPart_tab_selected(Event event) {
    }

    @FXML
    private void Mangment_supliers_tab_selected(Event event) {
    }

    @FXML
    private void Mangment_Staff_tab_selected(Event event) {
    }

    @FXML
    private void prbuttonReports(ActionEvent event) {
    }

    @FXML
    private void Mangment_Reports_tab_selected(Event event) {
    }

    
    

}












/*
package sample;

import com.jfoenix.controls.JFXButton;
import javafx.animation.TranslateTransition;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public Tab Mangment_MO_Tab;
    public Label MainLable;

    public TreeTableView TableViewReports;
    public TreeTableColumn Table_ColomnViewReports;
   public Label RepLable;
    public Tab Main_Tab;
    public ImageView icMaonMove;
    public AnchorPane kk;
    public JFXButton prbutton;
    public ListView listv;
    public JFXButton ShowMoWindowbuttn;



    @FXML
    private Label MainLable1;
    @FXML
    private ToggleGroup ReportsDate;


    @FXML
    public void Mangment_MO_tab_selected(Event event) {

      //  MainLable.setText("ادارة عمليات الصيانة");

    }

    @FXML
    public void Mangment_Customer_tab_selected(Event event) {
//        MainLable.setText("ادارة العملاء");

    }

    @FXML
    public void Mangment_supliers_tab_selected(Event event) {
  //      MainLable.setText("ادارة المزودين");
    }

    @FXML
    public void Mangment_Staff_tab_selected(Event event) {
    //    MainLable.setText("ادارة الموظفين");
    }

    @FXML
    public void RequstSpearPart_tab_selected(Event event) {
    //    MainLable.setText("طلب قطع غيار");
    }

    @FXML
    public void Mangment_SpearParts_tab_selected(Event event) {
        //MainLable.setText("ادارة قطع الغيار");
    }

    @FXML
    public void Mangment_Reports_tab_selected(Event event) {
        //MainLable.setText("ادارة التقارير");
    }



    @FXML
    public void Main_Tab(Event event) {
       
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listv.getItems().add("- عمليات الصيانة الحالية");
        listv.getItems().add("- عمليات الصيانة المنتهية");
        listv.getItems().add("- عمليات الصيانة السابقة");
        listv.getItems().add("- تقدير مالي عن عملية صيانة");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قائمة بالعملاء");
        listv.getItems().add("- قائمة عمليات الصيانة لعميل");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قائمة بالموظفين");
        listv.getItems().add("- قائمة عمليات الصيانة لموظف");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قائمة بالمزودين");
        listv.getItems().add("---------------------------");
        listv.getItems().add("- قطع على وشك النفاذ");
        listv.getItems().add("- قطع الغيار التي نفذت كميتها");


       


    }

    @FXML
    public void prbuttonReports(ActionEvent actionEvent) {
        //ReportTable.getItems().setAll(studentsModels1);
        //ReportTable.setItems(studentsModels1);
    }

    @FXML
    public void ShowMoWindow(ActionEvent actionEvent) {
        loadWindow("/sample/AddMoNeww.fxml" ,"" );
    }


    void loadWindow(String loc , String title){
        try {

            Parent parent = FXMLLoader.load(getClass().getResource(loc));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(new Scene(parent));
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }}

    @FXML
    private void Btn_ChangeMN_Customer(ActionEvent event) {
    }

    @FXML
    private void Btn_Cancle_Customer(ActionEvent event) {
    }

    @FXML
    private void Btn_Delete_Customer(ActionEvent event) {
    }

    @FXML
    private void Btn_Save_Customer(ActionEvent event) {
    }

    @FXML
    private void Btn_Search_Customer(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangeCurrentMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangeCurrentMO(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangeFinshedMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangeFinshedMO(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangePreviousMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangePreviousMO(ActionEvent event) {
    }

    @FXML
    private void Btn_Edit_MangePendingMO(ActionEvent event) {
    }

    @FXML
    private void Txfiled_Search_MangePendingMO(ActionEvent event) {
    }


    class StudentsModel {

//  private SimpleStringProperty Name;
  private  SimpleStringProperty Name;



        public StudentsModel( String reports) {
   this.Name = new SimpleStringProperty(reports);

  }

  public String getName() {
   return Name.get();
  }

  public void setName(String reportTableCol) {
   this.Name = new SimpleStringProperty(reportTableCol);
  }

 }
}
*/