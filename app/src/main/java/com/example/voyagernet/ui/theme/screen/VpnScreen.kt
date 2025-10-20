package com.example.voyagernet.ui.theme.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VpnScreen() {
    var isConnected by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("VPN Client", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                isConnected = !isConnected
            },
            modifier = Modifier
                .height(56.dp)
                .width(240.dp)
        ) {
            Text(if (isConnected) "Disconnect" else "Connect")
        }

        Spacer(Modifier.height(24.dp))

        Spacer(Modifier.height(8.dp))
    }
}