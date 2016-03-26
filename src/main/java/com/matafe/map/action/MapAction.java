package com.matafe.map.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class MapAction extends Action {

	private static final Log LOGGER = LogFactory.getLog(MapAction.class);

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		DynaActionForm dynaForm = (DynaActionForm) form;

		@SuppressWarnings("unchecked")
		Map<String, Object> newValues = (Map<String, Object>) dynaForm
				.get("newValues");

		LOGGER.debug("newvalue = " + newValues);
		LOGGER.debug("O valor é um array = " + newValues.get(newValues.keySet().iterator().next()).getClass().isArray());

		return mapping.findForward("success");
	}

}