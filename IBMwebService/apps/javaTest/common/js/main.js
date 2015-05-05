var busyIndicator = null;

function wlCommonInit() {
	busyIndicator = new WL.BusyIndicator();
	loadFeeds();
}

function loadFeeds() {
	busyIndicator.show();
	var invocationData = {
		adapter : 'tomcatService',
		procedure : 'getServiceClient',
		parameters : []
	};

	WL.Client.invokeProcedure(invocationData, {
		onSuccess : loadFeedsSuccess,
		onFailure : loadFeedsFailure
	});
}

function loadFeedsSuccess(result) {
	WL.Logger.debug("Feed retrieve success");
	busyIndicator.hide();

	alert(result.invocationResult.add);
}

function loadFeedsFailure(result) {
	WL.Logger.error("Feed retrieve failure");
	busyIndicator.hide();
	WL.SimpleDialog.show("Engadget Reader",
			"Service not available. Try again later.", [ {
				text : 'Reload',
				handler : WL.Client.reloadApp
			}, {
				text : 'Close',
				handler : function() {
				}
			} ]);
}
