Declared Invariants
===================

* clas.ICEBloodPressure: inv:At least one Blood Pressure param
* clas.ICEBloodPressureParam
* clas.ICEMultiMonitor: inv:At least one Blood Pressure param, inv:At least one Pulse Rate param, inv:At least one SpO2 param
* clas.ICEPulseOx: inv:At least one Pulse Rate param, inv:At least one SpO2 param
* clas.ICEPulseRate
* clas.ICESpO2
* device.MultiMonitor
* device.NellcorPulseOx
* device.NoninPulseOx
* schema.BatteryLevelStatus: inv:level is in 1..100
* schema.ClientInitiated
* schema.ComplexAlert
* schema.DistributionSA
* schema.Episodic
* schema.ICEAlert
* schema.ICEDataExchange
* schema.ICEDevice
* schema.ICEDeviceSetting
* schema.ICEDeviceStatus
* schema.ICEManufacturerModel
* schema.ICEMessageContext
* schema.ICEMetric
* schema.ICEPhysioParameter
* schema.ICESecurity
* schema.IntRange
* schema.IntRangeSetting
* schema.MetricAttribute
* schema.MetricTimeStampAttributes
* schema.NatRange
* schema.Numeric
* schema.ObsValue
* schema.ObsValueContext
* schema.Periodic
* schema.ProviderInitiated
* schema.Range: inv:min is less than or equal to max
* schema.RangeSetting: inv:min is less than or equal to max
* schema.RangeValueAlert
* schema.RealTimeSA
* schema.SampleArray
* schema.StatusAttributes
* schema.TargetValueAlert
* schema.TimeSA
* schema.ValueChangeAlert
* schema.ValueSetting