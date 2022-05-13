package com.G01.onlineFishAuction.dataAccess;

import com.G01.onlineFishAuction.entities.Fisherman;
import java.util.List;
public interface IFishermanRepository {
	void addFisherman(Fisherman fisherman);
	void deleteFisherman(Fisherman fisherman);
	List<Fisherman> getAll();
}
