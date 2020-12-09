package com.forbit.exo_player;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;


import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;

import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;


public class PlayerActivity extends AppCompatActivity {

    PlayerView playerView;
    SimpleExoPlayer player;
    String videoUri = "http://103.91.144.230/ftpdata/Movies/Hollywood/2020/Echo%20Boomers%20(2020)/Echo.Boomers.2020.720p.WEBRip.x264.AAC-[YTS.MX].mp4";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        player = new SimpleExoPlayer.Builder(this).build();

        playerView = findViewById(R.id.videoView);
        playerView.setPlayer(player);

        // Build the media item.
        MediaItem mediaItem = MediaItem.fromUri(videoUri);
// Set the media item to be played.
        player.setMediaItem(mediaItem);
// Prepare the player.
        player.prepare();
// Start the playback.
        player.play();

    }
}