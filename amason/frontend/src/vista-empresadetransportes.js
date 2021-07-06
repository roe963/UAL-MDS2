import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaEmpresadetransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout id="layout-empresaTransportes" class="content" style="width: 100%; justify-content: space-around; border: 1px solid black; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">
 <label id="label-empresaTransportes" style="flex-grow: 0; flex-shrink: 0; width: 90%;">Label</label>
 <vaadin-checkbox id="checkbox-empresaTransportes" style="flex-shrink: 0; width: 10%;">
  <iron-icon icon="lumo:eye" style="vertical-align: top;"></iron-icon>
 </vaadin-checkbox>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-empresadetransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresadetransportes.is, VistaEmpresadetransportes);
