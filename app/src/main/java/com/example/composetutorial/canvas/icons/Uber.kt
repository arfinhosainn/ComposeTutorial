package com.example.composetutorial.canvas.icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Uber() {
    Canvas(modifier = Modifier
        .size(80.dp)
        .padding(16.dp)) {

        val circleWidth = size.width * 0.6f
        val circleHeight = size.height * 0.6f
        val circleX = (size.width - circleWidth) / 2f
        val circleY = (size.height - circleHeight) / 2f


        val rectWidth = size.width * 0.6f
        val rectHeight = size.height * .1f
        val rectX = (size.width - circleWidth) / -1.3f
        val rectY = (size.height - circleHeight) / 0.9f

        drawCircle(color = Color(0xFF000000), size.height * 0.8f)
        drawRoundRect(
            color= Color(0xFFFFFFFF),
            cornerRadius = CornerRadius(10f,10f),
            size = Size(circleWidth, circleHeight),
            topLeft = Offset(circleX, circleY)
        )
        drawRoundRect(
            color= Color(0xFFFFFFFF),
            size = Size(rectWidth, rectHeight),
            topLeft = Offset(rectX, rectY)
        )
    }
}


@Preview
@Composable
fun PreviewUberIcon() {
    Uber()


}