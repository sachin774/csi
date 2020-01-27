package com.sachin.csi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shashank.sony.fancyaboutpagelib.FancyAboutPage;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        FancyAboutPage fancyAboutPage=view.findViewById(R.id.fancyaboutpage);
        //fancyAboutPage.setCoverTintColor(Color.BLUE);  //Optional
        fancyAboutPage.setCover(R.drawable.ui); //Pass your cover image
        fancyAboutPage.setName("Computer Society Of India");
        fancyAboutPage.setDescription("Android App, Game, Web and Software Developer.");
        fancyAboutPage.setAppIcon(R.drawable.ui); //Pass your app icon image
        fancyAboutPage.setAppName("CSI");
        fancyAboutPage.setVersionNameAsAppSubTitle("2020");
        fancyAboutPage.setAppDescription("Cake   Pop Icon Pack is an icon pack which follows Google's Material Design language.\n\n" +
                "This icon pack uses the material design color palette given by google. Every icon is handcrafted with attention to the smallest details!\n\n"+
                "A fresh new take on Material Design iconography. Cake Pop offers unique, creative and vibrant icons. Spice up your phones home-screen by giving it a fresh and unique look with Polycon.");
        fancyAboutPage.addEmailLink("sachinmishra1398@gmail.com");     //Add your email id
        fancyAboutPage.addFacebookLink("https://www.facebook.com/");  //Add your facebook address url
        fancyAboutPage.addTwitterLink("https://twitter.com/sachin");
        fancyAboutPage.addLinkedinLink("https://www.linkedin.com/in/");
        fancyAboutPage.addGitHubLink("https://github.com/");
        return view;
    }
    public void setAboutInformation()
    {

    }

}
