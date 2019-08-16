package es.hol.monitoringkolam.monitoring.pojo;

import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class Kekeruhan {
    private String ntu = "ntu";
    private String status = "status";

    public String getNtu() {
        return ntu;
    }

    public void setNtu(String ntu) {
        this.ntu = ntu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Kekeruhan(JSONObject obj) {
        try {
            String ntu = obj.getString("HasilNtu");
            String Status = obj.getString("StatusNtu");

            this.ntu = ntu;
            this.status = Status;
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
