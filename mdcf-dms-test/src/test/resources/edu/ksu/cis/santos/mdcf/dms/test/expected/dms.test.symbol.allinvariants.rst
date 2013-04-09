All (Declared and Inherited) Invariants
=======================================

* clas.ICEBloodPressure: (clas.ICEBloodPressure, inv:At least one Blood Pressure param)
* clas.ICEBloodPressureParam
* clas.ICEMultiMonitor: (clas.ICEMultiMonitor, inv:At least one Blood Pressure param), (clas.ICEMultiMonitor, inv:At least one Pulse Rate param), (clas.ICEMultiMonitor, inv:At least one SpO2 param)
* clas.ICEPulseOx: (clas.ICEPulseOx, inv:At least one Pulse Rate param), (clas.ICEPulseOx, inv:At least one SpO2 param)
* clas.ICEPulseRate
* clas.ICESpO2
* device.MultiMonitor: (clas.ICEMultiMonitor, inv:At least one Blood Pressure param), (clas.ICEMultiMonitor, inv:At least one Pulse Rate param), (clas.ICEMultiMonitor, inv:At least one SpO2 param)
* device.NellcorPulseOx: (clas.ICEPulseOx, inv:At least one Pulse Rate param), (clas.ICEPulseOx, inv:At least one SpO2 param)
* device.NoninPulseOx: (clas.ICEPulseOx, inv:At least one Pulse Rate param), (clas.ICEPulseOx, inv:At least one SpO2 param)
* schema.BatteryLevelStatus: (schema.BatteryLevelStatus, inv:level is in 1..100)
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
* schema.IntRange: (schema.Range, inv:min is less than or equal to max)
* schema.IntRangeSetting: (schema.RangeSetting, inv:min is less than or equal to max)
* schema.MetricAttribute
* schema.MetricTimeStampAttributes
* schema.NatRange: (schema.Range, inv:min is less than or equal to max)
* schema.Numeric
* schema.ObsValue
* schema.ObsValueContext
* schema.Periodic
* schema.ProviderInitiated
* schema.Range: (schema.Range, inv:min is less than or equal to max)
* schema.RangeSetting: (schema.RangeSetting, inv:min is less than or equal to max)
* schema.RangeValueAlert: (schema.RangeSetting, inv:min is less than or equal to max)
* schema.RealTimeSA
* schema.SampleArray
* schema.StatusAttributes
* schema.TargetValueAlert
* schema.TimeSA
* schema.ValueChangeAlert
* schema.ValueSetting