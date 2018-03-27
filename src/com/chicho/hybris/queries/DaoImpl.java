package com.chicho.datetime;

public class DaoImpl {
	
	public static final String IMO = "imo";
	private static final String ALLSHIPTOS_QUERY = "SELECT DISTINCT {pk} FROM {ShipToB2Bunit} WHERE {imo} =?imo";
	/**
	 * Return all Products In LubricantsVariantProduct for Mpid
	 */
	@Override
	public List<LubricantsVariantProductModel> getAllMLProductsForMpid(String mpid, CatalogVersionModel catVer) {

		final FlexibleSearchQuery query = new FlexibleSearchQuery( //
				"SELECT {" + LubricantsVariantProductModel.PK + "} " //
						+ "FROM {" + LubricantsVariantProductModel._TYPECODE + "} " //
						+ "WHERE {" + LubricantsVariantProductModel.MPID + "}=?mpid " //
						+ "AND {" + LubricantsVariantProductModel.CATALOGVERSION + "}=?catalogVersion");
		query.addQueryParameter(LubricantsVariantProductModel.MPID, mpid);
		query.addQueryParameter(LubricantsVariantProductModel.CATALOGVERSION, catVer);

		final SearchResult<LubricantsVariantProductModel> result = getFlexibleSearchService().search(query);
		final List<LubricantsVariantProductModel> products = result.getResult();

		if (products.isEmpty()) {
			throw new UnknownIdentifierException("Product with code '" + mpid + "' and CatalogVersion '"
					+ catVer.getCatalog().getId() + "." + catVer.getVersion() + "' not found!");
		}
		return products;
	}

	/**
	 * Return all ShipTos
	 */
	@Override
	public ShipToB2BunitModel getAllShipTos(String imo) {

		try {
			final Map<String, Object> parameters = Maps.newHashMap();
			parameters.put(IMO, imo);
			StringBuilder query = new StringBuilder(ALLSHIPTOS_QUERY);
			final FlexibleSearchQuery flexiQuery = new FlexibleSearchQuery(query);
			flexiQuery.addQueryParameters(parameters);
			final ShipToB2BunitModel searchResult = flexibleSearchService.searchUnique(flexiQuery);
			LOG.debug("Searched IMO: " + searchResult.getImo());
			return searchResult;

		} catch (Exception e) {
			LOG.debug("Searched IMO not found");
			return null;
		}
	}
}
