package com.iot.navigation1.ui.parent;

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

public class FragmentParentRoom extends Fragment {

    private FragmentParentRoomViewModel mViewModel;

    public static FragmentParentRoom newInstance() {
        return new FragmentParentRoom();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_parent, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("status","*************** created");
        final Button room2_wall_light=(Button) getActivity().findViewById(R.id.room2_wall_light);
        final Button room2_dim_light=(Button) getActivity().findViewById(R.id.room2_dim_light);
        final Button room2_fan=(Button) getActivity().findViewById(R.id.room2_fan);
        final Button room2_ac=(Button) getActivity().findViewById(R.id.room2_ac);
        final Button room2_bath_light=(Button) getActivity().findViewById(R.id.bathroom2_light);
        final Button room2_bath_geyser=(Button) getActivity().findViewById(R.id.bathroom2_geyser);
        final Button room2_socket=(Button) getActivity().findViewById(R.id.room2_socket);



        room2_wall_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";

                if(room2_wall_light.getTag()=="ON"){
                    msg = "room2_wall_light_off";
                    room2_wall_light.setText("OFF");
                    room2_wall_light.setTag("OFF");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }

                }
                else{

                    room2_wall_light.setText("ON");
                    room2_wall_light.setTag("ON");
                    msg = "room2_wall_light_on";
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        // Exhaust Fan coding ........
        room2_fan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";
                if(room2_fan.getTag()=="ON"){
                    msg = "room2_fan_off";
                    room2_fan.setText("OFF");
                    room2_fan.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room2_fan_on";
                    room2_fan.setText("ON");
                    room2_fan.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room2_ac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";
                if(room2_ac.getTag()=="ON"){
                    msg = "room2_ac_off";
                    room2_ac.setText("OFF");
                    room2_ac.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room2_ac_on";
                    room2_ac.setText("ON");
                    room2_ac.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        room2_dim_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";
                if(room2_dim_light.getTag()=="ON"){
                    msg = "room2_dim_light_off";
                    room2_dim_light.setText("OFF");
                    room2_dim_light.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room2_dim_light_on";
                    room2_dim_light.setText("ON");
                    room2_dim_light.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room2_bath_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";
                if(room2_bath_light.getTag()=="ON"){
                    msg = "room2_bath_light_off";
                    room2_bath_light.setText("OFF");
                    room2_bath_light.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room2_bath_light_on";
                    room2_bath_light.setText("ON");
                    room2_bath_light.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room2_bath_geyser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";
                if(room2_bath_geyser.getTag()=="ON"){
                    msg = "room2_geyser_off";
                    room2_bath_geyser.setText("OFF");
                    room2_bath_geyser.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room2_geyser_on";
                    room2_bath_geyser.setText("ON");
                    room2_bath_geyser.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room2_socket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/room2";
                String msg = "";
                if(room2_socket.getTag()=="ON"){
                    msg = "room2_socket_off";
                    room2_socket.setText("OFF");
                    room2_socket.setTag("OFF");
                    Log.d("TAG", "onClick: "+globalValue);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room2_socket_on";
                    room2_socket.setText("ON");
                    room2_socket.setTag("ON");
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


