package com.iot.navigation1.ui.familyroom;

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

import com.amazonaws.mobileconnectors.iot.AWSIotMqttQos;
import com.iot.navigation1.R;

import static com.iot.navigation1.MainActivity.globalValue;
import static com.iot.navigation1.MainActivity.mqttManager;

public class FamilyRoomFragment extends Fragment {

    private FamilyRoomViewModel mViewModel;

    public static FamilyRoomFragment newInstance() {
        return new FamilyRoomFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_familyroom, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("status","*************** created");
        final Button room3_wall_light=(Button) getActivity().findViewById(R.id.room3_wall_light);
        final Button room3_dim_light=(Button) getActivity().findViewById(R.id.room3_dim_light);
        final Button room3_fan=(Button) getActivity().findViewById(R.id.room3_fan);
        final Button room3_ac=(Button) getActivity().findViewById(R.id.room3_ac);
        final Button room3_bath_light=(Button) getActivity().findViewById(R.id.bathroom3_light);
        final Button room3_bath_geyser=(Button) getActivity().findViewById(R.id.bathroom3_geyser);
        final Button room3_socket=(Button) getActivity().findViewById(R.id.room3_socket);
        final Button room3_tv=(Button) getActivity().findViewById(R.id.room3_tv);

        room3_wall_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";

                if(room3_wall_light.getTag()=="ON"){
                    msg = "room3_wall_light_off";
                    room3_wall_light.setText("OFF");
                    room3_wall_light.setTag("OFF");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }

                }
                else{

                    room3_wall_light.setText("ON");
                    room3_wall_light.setTag("ON");
                    msg = "room3_wall_light_on";
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        // Exhaust Fan coding ........
        room3_fan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";
                if(room3_fan.getTag()=="ON"){
                    msg = "room3_fan_off";
                    room3_fan.setText("OFF");
                    room3_fan.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room3_fan_on";
                    room3_fan.setText("ON");
                    room3_fan.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room3_ac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";
                if(room3_ac.getTag()=="ON"){
                    msg = "room3_ac_off";
                    room3_ac.setText("OFF");
                    room3_ac.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room3_ac_on";
                    room3_ac.setText("ON");
                    room3_ac.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        room3_dim_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";
                if(room3_dim_light.getTag()=="ON"){
                    msg = "room3_dim_light_off";
                    room3_dim_light.setText("OFF");
                    room3_dim_light.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room3_dim_light_on";
                    room3_dim_light.setText("ON");
                    room3_dim_light.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });
        room3_bath_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";
                if(room3_bath_light.getTag()=="ON"){
                    msg = "room3_bath_light_off";
                    room3_bath_light.setText("OFF");
                    room3_bath_light.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room3_bath_light_on";
                    room3_bath_light.setText("ON");
                    room3_bath_light.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room3_bath_geyser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";
                if(room3_bath_geyser.getTag()=="ON"){
                    msg = "room3_geyser_off";
                    room3_bath_geyser.setText("OFF");
                    room3_bath_geyser.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room3_geyser_on";
                    room3_bath_geyser.setText("ON");
                    room3_bath_geyser.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room3_socket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";
                if(room3_socket.getTag()=="ON"){
                    msg = "room3_socket_off";
                    room3_socket.setText("OFF");
                    room3_socket.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room3_socket_on";
                    room3_socket.setText("ON");
                    room3_socket.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room3_tv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room3";
                String msg = "";

                if(room3_tv.getTag()=="ON"){
                    msg = "room3_tv_off";
                    room3_tv.setText("OFF");
                    room3_tv.setTag("OFF");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }

                }
                else{

                    room3_tv.setText("ON");
                    room3_tv.setTag("ON");
                    msg = "room3_tv_on";
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

    }

}
