package cl.luckio.usecases

import cl.luckio.data.LocationsRepository
import cl.luckio.domain.Location

class GetLocations(private val locationsRepository: LocationsRepository) {

    operator fun invoke(): List<Location> = locationsRepository.getSavedLocations()

}