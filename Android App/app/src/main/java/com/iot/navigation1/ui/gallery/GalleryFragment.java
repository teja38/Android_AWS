package com.iot.navigation1.ui.gallery;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        /*  final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("status","*************** created");
        final Button kitchen_wall_light=(Button) getActivity().findViewById(R.id.kitchen_wall_light);
        final Button kitchen_dim_light=(Button) getActivity().findViewById(R.id.kitchen_dim_light);
        final Button kitchen_exhaust=(Button) getActivity().findViewById(R.id.kitchen_exhaust);
        final Button kitchen_oven=(Button) getActivity().findViewById(R.id.kitchen_oven);
        final Button kitchen_socket=(Button) getActivity().findViewById(R.id.kitchen_socket);
        final Button kitchen_fridge=(Button) getActivity().findViewById(R.id.kitchen_fridge);
        final Button kitchen_chimney=(Button) getActivity().findViewById(R.id.kitchen_chimney);
        final Button templelight=(Button) getActivity().findViewById(R.id.templeLight);


        kitchen_wall_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";

                if(kitchen_wall_light.getTag()=="ON"){
                    msg = "kitchen_wall_light_off";
                    kitchen_wall_light.setText("OFF");
                    kitchen_wall_light.setTag("OFF");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }

                }
                else{

                    kitchen_wall_light.setText("ON");
                    kitchen_wall_light.setTag("ON");
                    msg = "kitchen_wall_light_on";
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
              }
        });

       // Exhaust Fan coding ........
        kitchen_exhaust.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";
                if(kitchen_exhaust.getTag()=="ON"){
                    msg = "kitchen_exhaust_off";
                    kitchen_exhaust.setText("OFF");
                    kitchen_exhaust.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "kitchen_exhaust_on";
                    kitchen_exhaust.setText("ON");
                    kitchen_exhaust.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        kitchen_oven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";
                if(kitchen_oven.getTag()=="ON"){
                    msg = "kitchen_oven_off";
                    kitchen_oven.setText("OFF");
                    kitchen_oven.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "kitchen_oven_on";
                    kitchen_oven.setText("ON");
                    kitchen_oven.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        kitchen_dim_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                 String topic ="home/kitchen";
                String msg = "";
                if(kitchen_dim_light.getTag()=="ON"){
                    msg = "kitchen_dim_light_off";
                    kitchen_dim_light.setText("OFF");
                    kitchen_dim_light.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "kitchen_dim_light_on";
                    kitchen_dim_light.setText("ON");
                    kitchen_dim_light.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        kitchen_fridge.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";
                if(kitchen_fridge.getTag()=="ON"){
                    msg = "kitchen_fridge_off";
                    kitchen_fridge.setText("OFF");
                    kitchen_fridge.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "kitchen_fridge_on";
                    kitchen_fridge.setText("ON");
                    kitchen_fridge.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });
        kitchen_socket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";
                if(kitchen_socket.getTag()=="ON"){
                    msg = "kitchen_socket_off";
                    kitchen_socket.setText("OFF");
                    kitchen_socket.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "kitchen_socket_on";
                    kitchen_socket.setText("ON");
                    kitchen_socket.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        kitchen_chimney.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";
                if(kitchen_chimney.getTag()=="ON"){
                    msg = "kitchen_chimney_off";
                    kitchen_chimney.setText("OFF");
                    kitchen_chimney.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "kitchen_chimney_on";
                    kitchen_chimney.setText("ON");
                    kitchen_chimney.setTag("ON");
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        templelight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String topic ="home/kitchen";
                String msg = "";
                if(templelight.getTag()=="ON"){
                    msg = "templelight_off";
                    templelight.setText("OFF");
                    templelight.setTag("OFF");

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS0);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "templelight_on";
                    templelight.setText("ON");
                    templelight.setTag("ON");
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
