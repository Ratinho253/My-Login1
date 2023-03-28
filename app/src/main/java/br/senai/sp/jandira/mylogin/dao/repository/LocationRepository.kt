package br.senai.sp.jandira.mylogin.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mylogin.R
import br.senai.sp.jandira.mylogin.model.Location
import java.time.Year


class LocationRepository {

    companion object{
        @Composable
        fun getLocationList() : List<Location>{
            return listOf<Location>(
                Location(
                    id = 1,
                    image = painterResource(id = R.drawable.london),
                    name = "London",
//                    year = Year.of(2019),
                    year = "2019",
                    description = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                    data_start_final = "18 Feb - 21 Feb"
                ),
                Location(
                    id = 2,
                    image = painterResource(id = R.drawable.porto),
                    name = "Porto",
//                    year = Year.of(2022),
                    year = "2022",
                    description = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                    data_start_final = "22 Feb - 25 Feb"
                )
            )
        }
    }
}