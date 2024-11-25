package datamahasiswa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControllerMahasiswa {
    ArrayList<ModelMahasiswa> ArrayData;
    DefaultTableModel tabellist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<ModelMahasiswa>();
    }
    public void InsertData(String npm, String nama, int tinggi, boolean pindahan){
        ModelMahasiswa mhs = new ModelMahasiswa(npm, nama, tinggi, pindahan);
        ArrayData.add(mhs);
    }

    TableModel showData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
