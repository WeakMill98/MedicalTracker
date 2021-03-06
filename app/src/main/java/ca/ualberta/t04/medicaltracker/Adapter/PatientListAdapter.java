package ca.ualberta.t04.medicaltracker.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import ca.ualberta.t04.medicaltracker.Patient;
import ca.ualberta.t04.medicaltracker.R;

public class PatientListAdapter extends ArrayAdapter {

    private int recourseId;
    private List<Patient> patients;

    public PatientListAdapter(@NonNull Context context, int resource, @NonNull List<Patient> patients) {
        super(context, resource, patients);
        recourseId = resource;
        this.patients = patients;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Patient patient = (Patient) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(recourseId, null);

        TextView userName = view.findViewById(R.id.patient_username);
        TextView detail = view.findViewById(R.id.patient_detail);

        userName.setText(patient.getUserName());
        String detail_text = getContext().getString(R.string.add_patient_detail);
        detail_text = detail_text.replace("%d", String.valueOf(patient.getProblemList().getProblems().size()));
        detail.setText(detail_text);

        return view;
    }
}
