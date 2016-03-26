package com.matafe.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.DynaActionForm;

public class UserAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		DynaActionForm userForm = (DynaActionForm) form;

		ActionMessages errors = new ActionMessages();

		// do the form validation in action class
		if (userForm.getString("username").isEmpty()) {
			errors.add("user.username.err", new ActionMessage(
					"error.user.username.required"));
		}

		saveErrors(request, errors);

		if (errors.isEmpty()) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failed");
		}

	}

}