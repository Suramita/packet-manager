package io.mosip.registration.repositories;

import io.mosip.kernel.core.spi.dataaccess.repository.BaseRepository;
import io.mosip.registration.entity.RegCenterDevice;
import io.mosip.registration.entity.RegCenterDeviceId;

/**
 * This repository interface for {@link RegCenterDevice} entity
 * 
 * @author Brahmananda Reddy
 * @since 1.0.0
 *
 */
public interface RegistrationCenterDeviceRepository extends BaseRepository<RegCenterDevice, RegCenterDeviceId> {

}
