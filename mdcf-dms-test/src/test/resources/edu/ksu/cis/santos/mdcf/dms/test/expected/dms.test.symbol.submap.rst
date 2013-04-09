Sub Transitive Map
==================

* Int: Nat
* IntegralType: Int
* Number: IntegralType
* clas.ICEMultiMonitor: device.MultiMonitor
* clas.ICEPulseOx: device.NellcorPulseOx, device.NoninPulseOx
* schema.ICEAlert: schema.ComplexAlert, schema.RangeValueAlert, schema.TargetValueAlert, schema.ValueChangeAlert
* schema.ICEDataExchange: schema.ClientInitiated, schema.ProviderInitiated
* schema.ICEDevice: clas.ICEBloodPressure, clas.ICEMultiMonitor, clas.ICEPulseOx
* schema.ICEDeviceSetting: schema.RangeSetting, schema.ValueSetting
* schema.ICEDeviceStatus: schema.BatteryLevelStatus
* schema.ICEMessageContext: schema.ObsValue
* schema.ICEMetric: schema.SampleArray, schema.Numeric
* schema.ICEPhysioParameter: clas.ICEBloodPressureParam, clas.ICEPulseRate, clas.ICESpO2
* schema.MetricAttribute: schema.MetricTimeStampAttributes, schema.StatusAttributes
* schema.ProviderInitiated: schema.Episodic, schema.Periodic
* schema.Range: schema.IntRange, schema.NatRange
* schema.RangeSetting: schema.IntRangeSetting, schema.RangeValueAlert
* schema.SampleArray: schema.DistributionSA, schema.RealTimeSA, schema.TimeSA
* schema.ValueSetting: schema.TargetValueAlert