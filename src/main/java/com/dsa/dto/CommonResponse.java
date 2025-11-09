package com.dsa.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {

	private Integer status;
	private String msg;
	private Object data;
	private DialogueBoxDetails dialogueBoxDetails;
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class DialogueBoxDetails {

		private String popUpSign;
		private String header;
		private String subHeader;
		private List<Action> actionList;
		
		@Data
		@AllArgsConstructor
		@NoArgsConstructor
		public class Action {
			
			private String buttonType;
			private String buttonText;
			private String onClickAction;
			private String route;
			private String redirectUrl;
		}
	}

	public CommonResponse(Integer status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	public CommonResponse(String msg, Object data ) {
		this.msg = msg;
		this.data = data;
	}
	
	public CommonResponse(Object data) {
		this.data = data;
	}
	
	public CommonResponse(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	public CommonResponse(DialogueBoxDetails dialogueBoxDetails) {
		this.dialogueBoxDetails = dialogueBoxDetails;
	}
}
