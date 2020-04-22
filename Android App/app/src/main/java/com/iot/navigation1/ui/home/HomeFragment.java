package com.iot.navigation1.ui.home;

import android.graphics.Color;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.text.format.DateFormat;
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

import com.amazonaws.mobileconnectors.iot.AWSIotMqttNewMessageCallback;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttQos;
import com.iot.navigation1.R;

import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;
import static com.iot.navigation1.MainActivity.globalValue;
import static com.iot.navigation1.MainActivity.mqttManager;

public class HomeFragment extends Fragment{

    public HomeFragment(){

    }


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
       /*  final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
              }
        });

*/


        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("status","*************** created");
        final Button hall_wall_light=(Button) getActivity().findViewById(R.id.hall_wall_light);
        final Button hall_dim_light=(Button) getActivity().findViewById(R.id.hall_dim_light);
        final Button hall_Fan=(Button) getActivity().findViewById(R.id.hall_Fan);
        final Button hall_ac=(Button) getActivity().findViewById(R.id.hall_ac);
        final Button hall_socket=(Button) getActivity().findViewById(R.id.hall_socket);
        final Button hall_tv=(Button) getActivity().findViewById(R.id.hall_tv);
        final ImageView roof_light_image=(ImageView) getActivity().findViewById(R.id.imageView10);
        final ImageView dim_light_image=(ImageView) getActivity().findViewById(R.id.imageView11);
        final ImageView fan_image=(ImageView) getActivity().findViewById(R.id.imageView12);
        final ImageView hall_ac_image=(ImageView) getActivity().findViewById(R.id.imageView13);

        hall_wall_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/hall";
                String msg = "";
                if(hall_wall_light.getTag()=="ON"){
                    msg = "hall_wall_light_off";
                    hall_wall_light.setText("OFF");
                    hall_wall_light.setTag("OFF");
                    hall_wall_light.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                       roof_light_image.setImageResource(R.drawable.roof_light_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "hall_wall_light_on";
                    hall_wall_light.setText("ON");
                    hall_wall_light.setTag("ON");
                    hall_wall_light.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        roof_light_image.setImageResource(R.drawable.roof_light);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        hall_dim_light.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/hall";
                String msg = "";
                if(hall_dim_light.getTag()=="ON"){
                    msg = "hall_dim_light_off";
                    hall_dim_light.setText("OFF");
                    hall_dim_light.setTag("OFF");
                    hall_dim_light.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        dim_light_image.setImageResource(R.drawable.light2_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "hall_dim_light_on";
                    hall_dim_light.setText("ON");
                    hall_dim_light.setTag("ON");
                    hall_dim_light.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        dim_light_image.setImageResource(R.drawable.light2_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        hall_Fan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/hall";
                String msg = "";
                if(hall_Fan.getTag()=="ON"){
                    msg = "hall_fan_off";
                    hall_Fan.setText("OFF");
                    hall_Fan.setTag("OFF");
                    hall_Fan.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        fan_image.setImageResource(R.drawable.fan_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "hall_fan_on";
                    hall_Fan.setText("ON");
                    hall_Fan.setTag("ON");
                    hall_Fan.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        fan_image.setImageResource(R.drawable.fan_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        hall_ac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/hall";
                String msg = "";
                if(hall_ac.getTag()=="ON"){
                    msg = "hall_ac_off";
                    hall_ac.setText("OFF");
                    hall_ac.setTag("OFF");
                    hall_ac.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        hall_ac_image.setImageResource(R.drawable.ac_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "hall_ac_on";
                    hall_ac.setText("ON");
                    hall_ac.setTag("ON");
                    hall_ac.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        hall_ac_image.setImageResource(R.drawable.ac_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        hall_socket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/hall";
                String msg = "";
                if(hall_socket.getTag()=="ON"){
                    msg = "hall_socket_off";
                    hall_socket.setText("OFF");
                    hall_socket.setTag("OFF");
                    hall_socket.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                      //  hall_ac_image.setImageResource(R.drawable.ac_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "hall_socket_on";
                    hall_socket.setText("ON");
                    hall_socket.setTag("ON");
                    hall_socket.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        //hall_ac_image.setImageResource(R.drawable.ac_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });

        hall_tv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String topic ="home/hall";
                String msg = "";
                if(hall_tv.getTag()=="ON"){
                    msg = "hall_tv_off";
                    hall_tv.setText("OFF");
                    hall_tv.setTag("OFF");
                    hall_tv.setTextColor(Color.RED);
                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                      //  hall_ac_image.setImageResource(R.drawable.ac_off);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }


                }
                else{
                    msg = "hall_tv_on";
                    hall_tv.setText("ON");
                    hall_tv.setTag("ON");
                    hall_tv.setTextColor(Color.BLACK);

                    try {
                        mqttManager.publishString(msg, topic, AWSIotMqttQos.QOS1);
                        //hall_ac_image.setImageResource(R.drawable.ac_on);
                    } catch (Exception e) {
                        Log.e("Error", "Publish error.", e);
                    }
                }
            }
        });


        //getHomeWeather();

     }

     public void getHomeWeather(){
         final TextView hallTextInTemp = (TextView)getActivity().findViewById(R.id.hallTextInTemp);
         final TextView hallTextHumid = (TextView)getActivity().findViewById(R.id.hallHumid);
         final String topic="home/hall/temp";

         Thread t = new Thread() {
             java.util.Date noteTS;
             String time = "hh:mm:ss"; // 12:00
             @Override
             public void run() {
                 try {
                     while (!isInterrupted()) {
                         Thread.sleep(10);
                         runOnUiThread(new Runnable() {
                         @Override
                         public void run() {
                             Log.d("Thread-------","started--------");
                             noteTS = Calendar.getInstance().getTime();
                             try {
                                 mqttManager.subscribeToTopic(topic, AWSIotMqttQos.QOS0,
                                         new AWSIotMqttNewMessageCallback() {
                                     @Override
                                     public void onMessageArrived(final String topic, final byte[] data) {
                                         runOnUiThread(new Runnable() {
                                                         @Override
                                                         public void run() {
                                                             try {
                                                                 String message = new String(data, "UTF-8");
                                                                 Log.d("Info ---", "Message arrived:");
                                                                 Log.d("Info --", "   Topic: " + topic);
                                                                 Log.d("Info ---", " Message: " + message);
                                                                 hallTextInTemp.setText(message.toString()+"°C");
                                                                 hallTextHumid.setText(message.toString()+"%");

                                                             } catch (UnsupportedEncodingException e) {
                                                                 Log.e("Erros", "Message encoding error.", e);
                                                             }
                                                         }
                                                     });
                                                 }
                                             });
                                 } catch (Exception e) {
                                     Log.e("Error", "Subscription error.", e);
                                 }

                             }
                         });
                     }
                 } catch (InterruptedException e) {
                     Log.d("error","error");
                 }
             }
         };
         t.start();
     }

}
