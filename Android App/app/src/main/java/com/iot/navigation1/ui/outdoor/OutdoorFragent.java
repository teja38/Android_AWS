package com.iot.navigation1.ui.outdoor;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.amazonaws.mobileconnectors.iot.AWSIotMqttQos;
import com.iot.navigation1.R;

import static com.iot.navigation1.MainActivity.globalValue;
import static com.iot.navigation1.MainActivity.mqttManager;

public class OutdoorFragent extends Fragment {

    private OutdoorFragentViewModel mViewModel;

    public static OutdoorFragent newInstance() {
        return new OutdoorFragent();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_outdoor, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final Button outdoor_wall_light=(Button) getActivity().findViewById(R.id.outdoor_wall_light);
        final Button outdoor_dim_light=(Button) getActivity().findViewById(R.id.outdoor_dim_light);
        final Button callingbell=(Button) getActivity().findViewById(R.id.callingbell);
        final Button outdoor_sump_motor=(Button) getActivity().findViewById(R.id.outdoor_sump_motor);
        final Button outdoor_socket=(Button) getActivity().findViewById(R.id.outdoor_socket);
        final Button outdoor_borewell_pump=(Button) getActivity().findViewById(R.id.outdoor_borewell_pump);
        final Button outdoor_gate=(Button) getActivity().findViewById(R.id.outdoor_gate);
        final ImageView outdoor_gate_image=(ImageView)getActivity().findViewById(R.id.outdoor_gate_image);
        final ImageView callingbellimage=(ImageView)getActivity().findViewById(R.id.callingbellimage);

        //final Button room3_tv=(Button) getActivity().findViewById(R.id.room3_tv);

        outdoor_wall_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(outdoor_wall_light.getTag()=="ON"){
                    msg = "outdoor_wall_light_off";
                    outdoor_wall_light.setText("OFF");
                    outdoor_wall_light.setTag("OFF");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
                else{
                    outdoor_wall_light.setText("ON");
                    outdoor_wall_light.setTag("ON");
                    msg = "outdoor_wall_light_on";
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        // Exhaust Fan coding ........
        outdoor_dim_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(outdoor_dim_light.getTag()=="ON"){
                    msg = "outdoor_dim_light_off";
                    outdoor_dim_light.setText("OFF");
                    outdoor_dim_light.setTag("OFF");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "outdoor_dim_light_on";
                    outdoor_dim_light.setText("ON");
                    outdoor_dim_light.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        callingbell.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(callingbell.getTag()=="ON"){
                    msg = "callingbell_off";
                    callingbell.setText("OFF");
                    callingbell.setTag("OFF");
                    callingbellimage.setImageResource(R.drawable.callingbelloff);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "callingbell_on";
                    callingbell.setText("ON");
                    callingbell.setTag("ON");
                    callingbellimage.setImageResource(R.drawable.callingbellon);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        outdoor_sump_motor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(outdoor_sump_motor.getTag()=="ON"){
                    msg = "outdoor_sump_motor_off";
                    outdoor_sump_motor.setText("OFF");
                    outdoor_sump_motor.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "outdoor_sump_motor_on";
                    outdoor_sump_motor.setText("ON");
                    outdoor_sump_motor.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });
        outdoor_socket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(outdoor_socket.getTag()=="ON"){
                    msg = "outdoor_socket_off";
                    outdoor_socket.setText("OFF");
                    outdoor_socket.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "outdoor_socket_on";
                    outdoor_socket.setText("ON");
                    outdoor_socket.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        outdoor_borewell_pump.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(outdoor_borewell_pump.getTag()=="ON"){
                    msg = "outdoor_borewell_pump_off";
                    outdoor_borewell_pump.setText("OFF");
                    outdoor_borewell_pump.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "outdoor_borewell_pump_on";
                    outdoor_borewell_pump.setText("ON");
                    outdoor_borewell_pump.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        outdoor_gate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/outdoor";
                String msg = "";
                if(outdoor_gate.getTag()=="open"){
                    msg = "outdoor_gate_close";
                    outdoor_gate.setText("Close");
                    outdoor_gate.setTag("close");
                    outdoor_gate_image.setImageResource(R.drawable.gateclose);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "outdoor_gate_open";
                    outdoor_gate.setText("Open");
                    outdoor_gate.setTag("open");
                    outdoor_gate_image.setImageResource(R.drawable.gateopen);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        // TODO: Use the ViewModel
    }

}
