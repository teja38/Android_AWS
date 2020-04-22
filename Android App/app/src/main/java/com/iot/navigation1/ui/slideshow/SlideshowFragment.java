package com.iot.navigation1.ui.slideshow;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.amazonaws.mobileconnectors.iot.AWSIotMqttQos;
import com.iot.navigation1.R;

import static com.iot.navigation1.MainActivity.globalValue;
import static com.iot.navigation1.MainActivity.mqttManager;
// MASTER BED ROOM
public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        return root;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("status","*************** created");
        final Button room1_wall_light=(Button) getActivity().findViewById(R.id.room1_wall_light);
        final Button room1_dim_light=(Button) getActivity().findViewById(R.id.room1_dim_light);
        final Button room1_fan=(Button) getActivity().findViewById(R.id.room1_fan);
        final Button room1_ac=(Button) getActivity().findViewById(R.id.room1_ac);
        final Button room1_socket=(Button) getActivity().findViewById(R.id.room1_socket);
        final Button bath_room1_light=(Button) getActivity().findViewById(R.id.bathroom1_light);
        final Button bath_room1_geyser=(Button) getActivity().findViewById(R.id.bathroom1_geyser);
        final ImageView roof_light_image=(ImageView) getActivity().findViewById(R.id.room1walllightimage);
        final ImageView dim_light_image=(ImageView) getActivity().findViewById(R.id.room1lightimage);
        final ImageView fan_image=(ImageView) getActivity().findViewById(R.id.room1fanimage);

        room1_wall_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(room1_wall_light.getTag()=="ON"){
                    msg = "room1_wall_light_off";
                    room1_wall_light.setText("OFF");
                    room1_wall_light.setTag("OFF");
                    room1_wall_light.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        roof_light_image.setImageResource(R.drawable.roof_light_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_wall_light_on";
                    room1_wall_light.setText("ON");
                    room1_wall_light.setTag("ON");
                    room1_wall_light.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        roof_light_image.setImageResource(R.drawable.roof_light);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room1_dim_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(room1_dim_light.getTag()=="ON"){
                    msg = "room1_dim_light_off";
                    room1_dim_light.setText("OFF");
                    room1_dim_light.setTag("OFF");
                    room1_dim_light.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        dim_light_image.setImageResource(R.drawable.light2_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_dim_light_on";
                    room1_dim_light.setText("ON");
                    room1_dim_light.setTag("ON");
                    room1_dim_light.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        dim_light_image.setImageResource(R.drawable.light2_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        room1_fan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(room1_fan.getTag()=="ON"){
                    msg = "room1_fan_off";
                    room1_fan.setText("OFF");
                    room1_fan.setTag("OFF");
                    room1_fan.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        fan_image.setImageResource(R.drawable.fan_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_fan_on";
                    room1_fan.setText("ON");
                    room1_fan.setTag("ON");
                    room1_fan.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        fan_image.setImageResource(R.drawable.fan_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        room1_ac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(room1_ac.getTag()=="ON"){
                    msg = "room1_ac_off";
                    room1_ac.setText("OFF");
                    room1_ac.setTag("OFF");
                    room1_ac.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        //roof_light_image.setImageResource(R.drawable.roof_light_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_ac_on";
                    room1_ac.setText("ON");
                    room1_ac.setTag("ON");
                    room1_ac.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        // roof_light_image.setImageResource(R.drawable.roof_light);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });
        room1_socket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(room1_socket.getTag()=="ON"){
                    msg = "room1_socket_off";
                    room1_socket.setText("OFF");
                    room1_socket.setTag("OFF");
                    room1_socket.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        //roof_light_image.setImageResource(R.drawable.roof_light_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_socket_on";
                    room1_socket.setText("ON");
                    room1_socket.setTag("ON");
                    room1_socket.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        // roof_light_image.setImageResource(R.drawable.roof_light);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        bath_room1_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(bath_room1_light.getTag()=="ON"){
                    msg = "room1_bath_light_off";
                    bath_room1_light.setText("OFF");
                    bath_room1_light.setTag("OFF");
                    bath_room1_light.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        //roof_light_image.setImageResource(R.drawable.roof_light_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_bath_light_on";
                    bath_room1_light.setText("ON");
                    bath_room1_light.setTag("ON");
                    bath_room1_light.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        // roof_light_image.setImageResource(R.drawable.roof_light);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        bath_room1_geyser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/room1";
                String msg = "";
                if(bath_room1_geyser.getTag()=="ON"){
                    msg = "room1_geyser_off";
                    bath_room1_geyser.setText("OFF");
                    bath_room1_geyser.setTag("OFF");
                    bath_room1_geyser.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        //roof_light_image.setImageResource(R.drawable.roof_light_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "room1_geyser_on";
                    bath_room1_geyser.setText("ON");
                    bath_room1_geyser.setTag("ON");
                    bath_room1_geyser.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        // roof_light_image.setImageResource(R.drawable.roof_light);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });



    }
}
