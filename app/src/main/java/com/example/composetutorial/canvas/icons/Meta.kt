package com.example.composetutorial.canvas.icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Meta() {
    Canvas(
        modifier = Modifier
            .size(80.dp)
            .padding(16.dp)
    ) {
        val width = size.width
        val height = size.height

        val path = Path().apply {
            moveTo(
                width.times(145f),
                height.times(0f),
            )
            cubicTo(
                width.times(275f),
                height.times(1277f),
                width.times(477f),
                height.times(0f),
                width.times(671f),
                height.times(538f)

            )

        }
        drawPath(
            path = path,
            color = Color.Black,
            style = Stroke(width = width.times(.09f), cap = StrokeCap.Round)
        )
    }
}




@Preview
@Composable
fun PreviewMetaLogo() {
    Meta()

}