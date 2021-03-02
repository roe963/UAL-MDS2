import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-datosdecompra`
 *
 * VistaDatosdecompra element.
 *
 * @customElement
 * @polymer
 */
class VistaDatosdecompra extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-datosdecompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDatosdecompra.is, VistaDatosdecompra);
